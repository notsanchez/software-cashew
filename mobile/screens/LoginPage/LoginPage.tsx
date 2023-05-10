import { StatusBar } from 'expo-status-bar';
import { useContext } from 'react';
import { Text, TouchableOpacity, View } from 'react-native';
import MainContext from '../../context/MainContext';

export default function LoginPage() {

    const { changeRoute } = useContext(MainContext);

    return (
        <>
            <View className="flex items-center justify-center h-screen w-screen">
                <Text>Pagina de login</Text>
                <TouchableOpacity onPress={() => changeRoute('index')} className='px-4 py-2 font-bold text-lg rounded-md'>
                    <Text className='font-bold'>
                        Voltar
                    </Text>
                </TouchableOpacity>
                <StatusBar style="auto" />
            </View>
        </>
    );
}