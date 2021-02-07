<template>
  <v-btn
    to="/register/syarat"
    large
    color="#03A1EA"
    class="white--text text-capitalize"
  >
    {{text}}
  </v-btn>
</template>

<script>
export default {
    props: ['text']
}
</script>