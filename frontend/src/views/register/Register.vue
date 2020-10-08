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
  beforeCreate() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>