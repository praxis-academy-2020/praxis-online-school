<template>
  <div>
    <navbarHome />
    <div class="mt-15">
      <h1>Creation page</h1>
    </div>
    <foot/>
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue"

export default {
  components: {
    navbarHome,
    foot
  }
};
</script>

<style>
</style>