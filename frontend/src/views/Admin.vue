<template>
  <div>
    <navigasi/>
    <tabl />
  </div>
</template>

<script>
import tabl from "@/components/admin/table.vue";
import navigasi from "@/components/admin/Navigation.vue"

export default {
  components: {
    tabl,
    navigasi
  },
  created() {
    this.$vuetify.theme.linght = true;
  }
};
</script>