<template>
  <div>
    <navbarHome :isInverted="true" />
    <corosel />
    <fas />
     <karyaa/>
    <!-- <cardss /> -->
    <silab/>
    <!-- <paralx /> -->
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import corosel from "@/components/home/carousel.vue";
import karyaa from "@/components/home/karya.vue";
// import paralx from "@/components/home/paralax.vue";
import foot from "@/components/footer/footer-home.vue";
import fas from "@/components/home/fasilitas.vue";
import silab from "@/components/home/silabus.vue"
export default {
  name: "Home",

  components: {
    navbarHome,
    karyaa,
    corosel,
    // paralx,
    foot,
    fas,
    silab
  },
  mounted(){
    scrollTo(0, 0);
  }
};
</script>
