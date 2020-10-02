<template>
  <div>
    <navbarHome />
    <div class="mt-5 d-flex justify-center">
      <v-img :src="logo" max-width="800"></v-img>
    </div>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import logo from "@/assets/404/404.png";

export default {
  data: () => {
    return {
      logo
    };
  },
  components: {
    navbarHome,
    foot
  },
  beforeMount() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>

<style>
</style>