package cn.dawnland.serverin8762.base;

import cn.dawnland.serverin8762.models.result.ReturnData;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseController {
    /**
     * 全局Controller异常处理，封装报错信息
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(Throwable.class)
    public ReturnData runtimeExceptionHandler(Throwable exception) {
        ReturnData returnData = ReturnData.isFail(exception.getMessage());
        return returnData;
    }
}
