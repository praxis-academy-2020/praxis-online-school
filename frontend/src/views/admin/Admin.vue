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
  }
};
</script>