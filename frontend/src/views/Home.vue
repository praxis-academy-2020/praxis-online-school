<template>
  <div>
    <navbarHome :isInverted="true" />
    <corosel />
    
    
    <!-- <abouts /> -->
    
    <fas />
    <cardss />
    <silab/>
    <paralx />
    <!-- <daftarkuy /> -->
    <!-- <cardsss /> -->
    <!-- <aboutss /> -->
    
    
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import corosel from "@/components/home/carousel.vue";
// import abouts from "@/components/home/about.vue";
// import aboutss from "@/components/home/about2.vue";
import cardss from "@/components/home/card2.vue";
// import cardsss from "@/components/home/card3.vue";
// import slidee from "@/components/home/slide.vue";
import paralx from "@/components/home/paralax.vue";
// import daftarkuy from "@/components/home/daftar.vue";
import foot from "@/components/footer/footer-home.vue";
import fas from "@/components/home/fasilitas.vue";
import silab from "@/components/home/silabus.vue"
export default {
  name: "Home",

  components: {
    navbarHome,
    // slidee,
    corosel,
    cardss,
    // cardsss,
    // abouts,
    paralx,
    // aboutss,
    // daftarkuy,
    foot,
    fas,
    silab
  },
  beforeCreate() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    }else{
      this.$router.push({name: 'Dashboard'})
    }
  }
};
</script>
