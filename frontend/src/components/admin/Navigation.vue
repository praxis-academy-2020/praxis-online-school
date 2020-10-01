<template>
  <div>
    <v-navigation-drawer permanent app>
      <v-list dense>
        <router-link to="/admin/dashboard" class="text-decoration-none">
          <v-list-item link>
            <v-list-item-icon>
              <v-icon>mdi-view-dashboard</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Dashboard</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>

        <router-link to="/admin/Tampil-table" class="text-decoration-none">
          <v-list-item link>
            <v-list-item-icon>
              <v-icon>mdi-view-grid-plus</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Tampil Table</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>

        <router-link to="/admin/tambah-karya" class="text-decoration-none">
          <v-list-item link>
            <v-list-item-icon>
              <v-icon>mdi-view-grid-plus</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>Tambah karya</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>

         
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
  methods: {
    logout: function() {
      return this.$router.push({ name: "Home" });
    }
  }
};
</script>

<style>
</style>