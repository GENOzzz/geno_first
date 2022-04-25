function id_check(){
    var id = $('#id').val();
    $.ajax({
            url:'/signup/checkID',
            type:'post',//POST 방식으로 전달
            datatype:'json',
            data:{"id":id},
            success:function(data){
                if(data==1){
                    $('#id_success').css("display","inline-block")
                    $('#id_overlap').css("display","none")
                    $('#id_min').css("display","none")
                }else if(data==0){
                    $('#id_success').css("display","none")
                    $('#id_overlap').css("display","none")
                    $('#id_min').css("display","inline-block")
                }else if(data==2){
                    $('#id_success').css("display","none")
                    $('#id_overlap').css("display","inline-block")
                    $('#id_min').css("display","none")
                }
            }
        })
}

