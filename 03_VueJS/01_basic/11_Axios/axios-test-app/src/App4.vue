<template>
  <div>
    <h2>콘솔 확인하기</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const listUrl = '/api/todos';

const requestAPI = async () => {
  let todoList = [];

  try {
    const list = await axios.get(listUrl);
    todoList = list.data;
    console.log(todoList);

    const todo1 = await axios.get(`${listUrl}/${todoList[0].id}`);
    console.log('첫 번째 todo : ', todo1.data);

    const todo2 = await axios.get(`${listUrl}/${todoList[1].id}`);
    console.log('두 번째 todo : ', todo2.data);

    let data = { todo: '윗몸일으키기 3세트', desc: '너무 빠르지 않게...' };
    await axios.post(`${listUrl}`, data);

    console.log(await axios.get(listUrl));
  } catch (e) {
    console.log(e);
  }
};

requestAPI(); // 함수 호출
</script>

<style scoped></style>
