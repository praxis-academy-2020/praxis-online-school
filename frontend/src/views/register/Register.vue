<template>
  <div>
    <navbarHome/>
    <h1>Register</h1>
    <router-view></router-view>
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue"

export default {
  components: {
    navbarHome
  }
}
</script>