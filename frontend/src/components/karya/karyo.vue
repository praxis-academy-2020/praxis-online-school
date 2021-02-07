<template>
  <div>
    <iframe
      width="100%"
      height="300px"
      :src="src"
      frameborder="0"
      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
      allowfullscreen
    ></iframe>
    <v-btn depressed color="primary" :href="hrf" target="_blank">Github</v-btn>
  </div>
</template>

<script>
export default {
  props: ["src", "hrf"],
};
</script>

<style>
</style>