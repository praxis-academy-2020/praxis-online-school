<template>
  <div>
    <navbarHome :isInverted="false" />
    <router-view></router-view>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";

export default {
  components: {
    navbarHome,
    foot
  },
  mounted(){
    scrollTo(0, 0);
  }
};
</script>