package com.zdx.saber.kaka.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;

/**
 * @author dongxu.zhang 3002691976@qq.com
 * @Description
 * @ClassName XmlUtil
 * @Date Created in 16:59 2018-10-23
 */
public class XmlUtil {


    public static JsonNode XmlToJsonNode(String xml){

        if (null == xml || xml.length() == 0){
            return null;
        }
        //将xml转为json
        String json  = XML.toJSONObject(xml).toString();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json,JsonNode.class);
        } catch (IOException e) {
            return null;
        }

    }

    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><transaction><transaction_header><version>V2.1.2</version><transtype>P033" +
                "</transtype><employno>9000001021</employno><termid>00000013</termid><request_time>20181023164431</request_time" +
                "></transaction_header><transaction_body><orderno>ST18296160173</orderno><cod>0.01</cod><payway>88</payway><banktrace" +
                ">07580803424W</banktrace><postrace>000003</postrace><tracetime>20181023164425</tracetime><cardid/><signer/><signflag>0" +
                "</signflag><cardtype/><issuebankcode/></transaction_body></transaction>";
        JsonNode jsonNode = XmlUtil.XmlToJsonNode(xml);
        System.out.println(jsonNode);

    }


}