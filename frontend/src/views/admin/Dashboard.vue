<template>
  <div>
    <tabl />
  </div>
</template>

<script>
import tabl from "@/components/admin/table.vue";

export default {
  components: {
    tabl
  },
  created() {
    this.$vuetify.theme.linght = true;
  }
};
</script>