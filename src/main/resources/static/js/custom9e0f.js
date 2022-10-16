$(document).ready(function() {
      $('.main_banner').slick({
         dots: true,
         infinite: true,
         arrows: true,
         autoplay: true,
         autoplaySpeed: 3000,
         speed: 2000,
         fade: false,
         pauseOnHover: false,
         pauseOnFocus: false,
         responsive: [{
             breakpoint: 992,
             settings: {
                 arrows: false,
                 dots: false
             }
                }]
     }); 
      $('.menu').on({
         click: function () {
             if ($(this).hasClass("active")) {
                 $('.menu').removeClass("active");
                 $('nav').removeClass("active");
             } else {
                 $('.menu').addClass("active");
                 $('nav').addClass("active");
             }
         }
     });
    
});