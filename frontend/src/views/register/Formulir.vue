<template>
  <div class="mt-15">
    <formRegister />
  </div>
</template>

<script>
import formRegister from "@/components/form-register.vue";

export default {
  components: {
    formRegister
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

<style>
</style>