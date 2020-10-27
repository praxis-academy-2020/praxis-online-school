<template>
  <div>
    <navbar />
    <div class="mt-15">
        <Hero />
      <h1>Program {{ this.$route.params.name }}</h1>
    </div>
    <foot />
  </div>
</template>

<script>
import navbar from "@/components/navbar/navbar-home.vue";
import Hero from "@/components/program/hero.vue"
import foot from "@/components/footer/footer-home.vue";

export default {
  components: {
    foot,
    navbar,
    Hero
  },
};
</script>

<style>
</style>