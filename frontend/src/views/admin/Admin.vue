<template>
  <div>
    <div v-if="localStorage.getItem('Bearer') == ''">
      <h1>Silakan login</h1>
    </div>
    <div v-else>
      <navigasi />
      <router-view></router-view>
    </div>
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