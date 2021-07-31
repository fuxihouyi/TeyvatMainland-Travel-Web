$(document).ready(function(){
    var num =1;
    $("#page1").click(function(){
        num = $("#page1").text();
        $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
        $("#page1").addClass("active");

    })
    $("#page2").click(function(){
        num = $("#page2").text();
        $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
        $("#page2").addClass("active");

    })
    $("#page3").click(function(){
        num = $("#page3").text();
        $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
        $("#page3").addClass("active");
    })
    $("#page4").click(function(){
        num = $("#page4").text();
        $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
        $("#page4").addClass("active");
    })
    $("#page5").click(function(){
        num = $("#page5").text();
        $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
        $("#page5").addClass("active");
    })
    $("#pre").click(function(){
        
        if(num>1){
            num = num -1;
            $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
            var id = '#'+'page'+num;
            $(id).addClass("active");

        }
    })
    $("#next").click(function(){
            
            if(num<=4){
                num++;
                $("#page1,#page2,#page3,#page4,#page5").removeClass("active")
                var id = '#'+'page'+num;
                $(id).addClass("active");
            }
        })
})
