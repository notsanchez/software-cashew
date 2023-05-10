import { StatusBar } from 'expo-status-bar';
import { useContext } from 'react';
import { Text, TouchableOpacity, View } from 'react-native';
import MainContext from '../../context/MainContext';

export default function WelcomePage() {

    const { changeRoute } = useContext(MainContext);

    return (
        <>
            <View className="flex-1 items-center justify-center">
                <Text>Bem-vindo ao Cashew!</Text>
                <TouchableOpacity onPress={() => changeRoute('login')} className='px-4 py-2 font-bold text-lg bg-primary rounded-md'>Login</TouchableOpacity>
                <StatusBar style="auto" />
            </View>
        </>
    );
}