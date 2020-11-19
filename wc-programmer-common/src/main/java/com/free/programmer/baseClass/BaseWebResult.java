package com.free.programmer.baseClass;

import com.free.programmer.baseEnums.BaseResultCode;

import java.io.Serializable;

/**
 * @Title: BaseWebResult
 * @author: wangcheng
 * @createTime 2020/11/3 0003
 * @content
 */
public class BaseWebResult implements Serializable{

      private BaseResultCode code;

      private String message;

      private Object data;

      public static final BaseWebResult SUCCESS = new BaseWebResult();

      public BaseWebResult() {
            this.code = BaseResultCode.SUCCESS;
            this.message = null;
      }

      public BaseWebResult(BaseResultCode code, String message, Object data) {
            this.code = code;
            this.message = message;
            this.data = data;
      }

      public BaseWebResult(BaseResultCode code,Object data, String message, Object... args) {
            this.code = code;
            this.message = String.format(message,args);
            this.data = data;

      }

      public BaseWebResult(BaseResultCode code, String message) {
            this.code = code;
            this.message = message;
            this.data = null;
      }

      public BaseWebResult(BaseResultCode code, Object data) {
            this.code = code;
            this.data = data;
            this.message = "";
      }

      public BaseResultCode getCode() {
            return code;
      }

      public void setCode(BaseResultCode code) {
            this.code = code;
      }

      public String getMessage() {
            return message;
      }

      public void setMessage(String message) {
            this.message = message;
      }

      public Object getData() {
            return data;
      }

      public void setData(Object data) {
            this.data = data;
      }

      public boolean isSuccess(){
            return BaseResultCode.SUCCESS == this.code;
      }

      public boolean isFail(){
            return !isSuccess();
      }
}
