<template>
  <div>
    <h2>콘솔 확인하기</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const listUrl = '/api/todos';

const requestAPI = () => {
  let todoList = [];

  axios
    .get(listUrl)
    .then((resp) => {
      todoList = resp.data;
      console.log(todoList);
      return todoList[0].id;
    })
    .then((id) => {
      return axios.get(`${listUrl}/${id}`);
    })
    .then((resp) => {
      console.log('첫 번째 todo : ', resp.data);
      return todoList[1].id;
    })
    .then((id) => {
      return axios.get(`${listUrl}/${id}`);
    })
    .then((resp) => {
      console.log('두 번째 todo : ', resp.data);
    })
    .catch((e) => {
      console.log(e);
    });
};

requestAPI(); // 함수 호출
</script>

<style scoped></style>
