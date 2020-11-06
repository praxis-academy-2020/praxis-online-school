<template>
  <div>
    <v-container>
      <v-row>
        <v-col class="d-flex justify-center mb-10">
          <div
            class="mb-10 text-h4 text-sm-h3 font-weight-medium primary--text"
          >
            Karya Praxis Academy
          </div>
        </v-col>
      </v-row>

      <v-row>
        <v-col order="last" order-sm="first" cols="12" sm="7">
          <v-list>
            <v-list-item v-for="(item, i) in items" :key="i">
              <p v-text="item.paraa"></p>

              <v-list-item-icon>
                <v-icon class="primary--text" v-text="item.icon"></v-icon>
              </v-list-item-icon>
              <v-list-item-content>
                <h2 class="primary--text" v-text="item.text"></h2>
                <p v-text="item.para"></p>
              </v-list-item-content>
            </v-list-item>
          </v-list>
        </v-col>

        <v-col cols="12" sm="5" order="first" order-sm="last">
          <img src="@/assets/LOGOOO.png" alt="" width="90%" />
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  data: () => ({
    selectedItem: 1,
    items: [
      {
        paraa:
          "Karya Praxis Academy adalah hasil ide dari anggota Praxis Academy.",
      },
      {
        text: "Aplikasi",
        icon: "mdi-check-bold",
        para:
          "Aplikasi yang telah di luncurkan ke dalam bentuk aplikasi mobile.",
      },
      {
        text: "Website",
        icon: "mdi-check-bold",
        para: "Aplikasi yang telah di luncurkan ke dalam bentuk aplikasi Web.",
      },
      {
        text: "Download Aplikasi",
        icon: "mdi-check-bold",
        para:
          "Aplikasi yang telah dibuat dapat teman-teman lihat di github Praxis Academy.",
      },
    ],
  }),
};
</script>