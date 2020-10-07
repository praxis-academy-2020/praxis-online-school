<template>
  <div>
    <navigasi />
    <router-view></router-view>
  </div>
</template>

<script>
import navigasi from "@/components/admin/Navigation.vue";

export default {
  components: {
    navigasi
  },
  mounted() {
    this.$store.dispatch("getApiPeserta");
    console.log("local ", localStorage.getItem("Bearer"));
  },
  // beforeMount() {
  //   if (localStorage.getItem("Bearer")) {
  //     scrollTo(0, 0);
  //   } else {
  //     this.$router.push({ name: "Home" });
  //   }
  // }
};
</script>