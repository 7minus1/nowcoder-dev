function like(btn, entityType, entityId) {
    $.post(
        CONTEXT_PATH + "/like",
        {"entityType": entityType, "entityId": entityId},
        function(data) {
            data = $.parseJSON(data);
            if (data.code == 0) {   // 请求成功
                // 改变 状态<b> 和 数量<i>
                $(btn).children("b").text(data.likeStatus==1? '已赞':'赞');
                $(btn).children("i").text(data.likeCount);
            } else {
                alert(data.msg);
            }
        }
    );

}