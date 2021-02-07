<template>
  <div style="margin-top: 50px;">
    <formRegister />
  </div>
</template>

<script>
import formRegister from "@/components/form-register.vue";

export default {
  components: {
    formRegister
  },
  mounted(){
    scrollTo(0, 0);
  }
};
</script>