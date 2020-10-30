<template>
  <div style="padding: 100px 0 0 0" class="grey lighten-4">
    <v-container>
      <v-row>
        <v-col cols="12" md="5" class="d-flex justify-center">
          <img :src="src" alt="image" width="350px" />
        </v-col>
        <v-col cols="12" md="7">
          <div class="py-5 text-center">
            <div class="mb-10 text-h4 text-sm-h3 font-weight-medium">
              {{judul}}
            </div>
            <p class="font-weight-light">{{ keterangan }}</p>
          </div>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  props: ["src", "judul", "keterangan"],
};
</script>