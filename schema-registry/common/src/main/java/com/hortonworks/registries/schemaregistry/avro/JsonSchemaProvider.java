package com.hortonworks.registries.schemaregistry.avro;

import com.hortonworks.registries.schemaregistry.AbstractSchemaProvider;
import com.hortonworks.registries.schemaregistry.CompatibilityResult;
import com.hortonworks.registries.schemaregistry.SchemaCompatibility;
import com.hortonworks.registries.schemaregistry.SchemaFieldInfo;
import com.hortonworks.registries.schemaregistry.errors.InvalidSchemaException;
import com.hortonworks.registries.schemaregistry.errors.SchemaNotFoundException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class JsonSchemaProvider  extends AbstractSchemaProvider {


    public static final String TYPE = "json";

    @Override
    public String getName() {
            return "json schema provider";
    }

    @Override
    public String getDescription() {
        return "This provider supports json schemas. You can find more information about avro at http://avro.apache.org";
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public CompatibilityResult checkCompatibility(String toSchema, String existingSchema, SchemaCompatibility compatibility) {
        return CompatibilityResult.SUCCESS;
    }

    /**
     * 主要进行json校验，以及生产md5 指纹，校验json可以使用Json解析器，注意引用的maven不要和其他冲突
     * 1. 引入fastjson会导致web空指针异常
     * @param schemaText textual representation of schema
     *
     * @return
     * @throws InvalidSchemaException
     * @throws SchemaNotFoundException
     */
    @Override
    public byte[] getFingerprint(String schemaText) throws InvalidSchemaException, SchemaNotFoundException {
        try {
//            JSONObject jsonObject = JSONObject.parseObject(schemaText);
            return MessageDigest.getInstance("MD5").digest(schemaText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 这个方法是主要是 schema_field_info 表中的数据，主要是用于区分shcema的 namespace 以及  type
     * 经过测试
     * 1. 不能为空，不能返回空值,后在调用的地方做了空值判断，可以为空
     * 2. 这个可以一个或者多个，平常情况下应该属于一个 namespace
     * @param schemaText schema text
     *
     * @return
     * @throws InvalidSchemaException
     * @throws SchemaNotFoundException
     */
    @Override
    public List<SchemaFieldInfo> generateFields(String schemaText) throws InvalidSchemaException, SchemaNotFoundException {
//        List<SchemaFieldInfo> list = new ArrayList<>();
//        SchemaFieldInfo aa = new SchemaFieldInfo("com.data","test","json");
//        list.add(aa);
        return null;
    }
}
