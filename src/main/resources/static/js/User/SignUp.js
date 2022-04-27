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
                    $('#id_blank').css("display","none")
                }else if(data==0){
                    $('#id_success').css("display","none")
                    $('#id_overlap').css("display","none")
                    $('#id_min').css("display","inline-block")
                    $('#id_blank').css("display","none")
                }else if(data==2){
                    $('#id_success').css("display","none")
                    $('#id_overlap').css("display","inline-block")
                    $('#id_min').css("display","none")
                    $('#id_blank').css("display","none")
                }else if(data==3){
                    $('#id_success').css("display","none")
                    $('#id_overlap').css("display","none")
                    $('#id_min').css("display","none")
                    $('#id_blank').css("display","inline-block")
                }
            }
        })
}

function pw_check(){
    var pw1= $('#pw1').val();
    var pw2= $('#pw2').val();
    if(pw1===pw2){
        $('#pw_success').css("display","inline-block")
        $('#pw_fail').css("display","none")
    }else{
        $('#pw_fail').css("display","inline-block")
        $('#pw_success').css("display","none")
    }
}

function name_check(){
    var name=$('#name').val();
    var firstWord=name.slice(0,1);
    var kor_pattern= /^[가-힣]+$/;
    var eng_pattern=/^[a-zA-z\s]+$/;
    console.log(firstWord)
    if(firstWord!=""){
        if(kor_pattern.test(firstWord)){
            if(kor_pattern.test(name)){
                $('#name_fail').css("display","none")
            }else{
                $('#name_fail').css("display","inline-block")
            }
        }else if(firstWord!=" "&&eng_pattern.test(firstWord)){
            if(eng_pattern.test(name)){
                $('#name_fail').css("display","none")
            }else{
                $('#name_fail').css("display","inline-block")
            }
        }else{
            $('#name_fail').css("display","inline-block")
        }
    }else{
        $('#name_fail').css("display","none")
    }
}
