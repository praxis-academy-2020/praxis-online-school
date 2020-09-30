<template>
  <div>
    <!-- dekstop -->
    <v-app-bar class="d-sm-none" color="primary" dark fixed>
      <v-app-bar-nav-icon @click="isNav = true"></v-app-bar-nav-icon>

      <router-link to="/" class="text-decoration-none">
        <v-toolbar-title>
          <h1>Duarr</h1>
        </v-toolbar-title>
      </router-link>

      <v-spacer></v-spacer>
    </v-app-bar>

    <!-- mobile -->
    <v-navigation-drawer v-model="isNav" app>
      <v-list dense>
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-view-dashboard</v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title>Dashboard</v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-view-dashboard</v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title>Setting</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <template v-slot:append>
        <div class="pa-3 d-flex justify-center">
          <v-btn color="error" @click="logout">Logout</v-btn>
        </div>
      </template>
    </v-navigation-drawer>
  </div>
</template>

<script>
export default {
  data: () => {
    return {
      isNav: false
    };
  },
  methods: {
    logout: function() {
      return this.$router.push({ name: "Home" });
    }
  }
};
</script>

<style>
</style>