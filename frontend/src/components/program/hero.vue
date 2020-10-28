<template>
  <div style="padding: 80px 0">
    <v-container>
      <v-row>
        <v-col cols="12" md="6">
          <div class="text-h3 py-5">Frontend developer</div>
          <div class="py-5">
            Lorem, ipsum dolor sit amet consectetur adipisicing elit.
            Consectetur, cupiditate eveniet excepturi eaque minus dolorem
            recusandae rerum unde impedit incidunt aliquam. Rem, aperiam
            adipisci asperiores totam inventore culpa vel mollitia!
          </div>

          <div class="pt-10">
            <v-btn
              to="/register/syarat"
              large
              color="#63D0FF"
              class="white--text"
            >
              daftar sekarang
            </v-btn>
          </div>
        </v-col>

        <v-col cols="0" md="6" class="d-none d-md-flex justify-center">
          <img src="@/assets/program/ill1.svg" alt="image" width="350px" />
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {};
</script>