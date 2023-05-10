import { StatusBar } from 'expo-status-bar';
import { useContext } from 'react';
import { Text, TouchableOpacity, View } from 'react-native';
import MainContext from '../../context/MainContext';

export default function WelcomePage() {

    const { changeRoute } = useContext(MainContext);

    return (
        <>
            <View className="flex items-center justify-center h-screen w-screen">
                <Text>Bem vindo ao cashew!</Text>
                <TouchableOpacity onPress={() => changeRoute('login')} className='px-4 py-2 font-bold text-lg bg-primary rounded-md'>
                    <Text>Login</Text>
                </TouchableOpacity>
                <StatusBar style="auto" />
            </View>
        </>
    );
}