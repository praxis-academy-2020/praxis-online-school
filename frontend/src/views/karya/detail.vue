<template>
  <div>
    <navb />
    <h1 class="mt-15">{{data.title}}</h1>
    <iframe
      src="https://www.youtube.com/watch?v=OxcxhvMi1MU"
      frameborder="0"
      width="420"
      height="315"
    ></iframe>
    <foot />
  </div>
</template>

<script>
import navb from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import { mapGetters } from "vuex";

export default {
  components: {
    navb,
    foot
  },
  computed: {
    ...mapGetters(["gettersKarya"]),
    data: function() {
      return this.gettersKarya[this.$route.params.id - 1];
    }
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