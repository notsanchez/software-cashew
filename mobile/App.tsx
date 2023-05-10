import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { Text, View } from 'react-native';
import { MainContextProvider } from './context/MainContext';
import Router from './router/Router';

export default function App() {

  return (
    <>
      <MainContextProvider>
        <Router />
      </MainContextProvider>
    </>
  );
}