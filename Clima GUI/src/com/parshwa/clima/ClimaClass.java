/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.parshwa.clima;

import javax.swing.JOptionPane;

public class ClimaClass extends javax.swing.JFrame {
    public ClimaClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold default state="collapsed" desc="Generated Code">
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        weatherDetailTitle = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        windLabel = new javax.swing.JLabel();
        pressureLabel = new javax.swing.JLabel();
        humidityLabel = new javax.swing.JLabel();
        cityNameLabel = new javax.swing.JLabel();
        coordLabel = new javax.swing.JLabel();
        tempLabel1 = new javax.swing.JLabel();
        tempValue = new javax.swing.JLabel();
        descriptionValue = new javax.swing.JLabel();
        windSpeedValue = new javax.swing.JLabel();
        pressureValue = new javax.swing.JLabel();
        humidityValue = new javax.swing.JLabel();
        cityValue = new javax.swing.JLabel();
        coordValue = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        climaTitle = new javax.swing.JLabel();
        currentWeatherButton = new javax.swing.JButton();
        cityTextField = new javax.swing.JTextField();
        cityWeatherButton = new javax.swing.JButton();
        climaTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C L I M A - G U I");

        rightPanel.setBackground(new java.awt.Color(41, 67, 92));

        weatherDetailTitle.setFont(new java.awt.Font("Skia", 1, 48)); // NOI18N
        weatherDetailTitle.setForeground(new java.awt.Color(255, 255, 255));
        weatherDetailTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherDetailTitle.setText("Weather Deatils");

        descriptionLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Description       : ");

        windLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        windLabel.setForeground(new java.awt.Color(255, 255, 255));
        windLabel.setText("Wind Speed      : ");

        pressureLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        pressureLabel.setForeground(new java.awt.Color(255, 255, 255));
        pressureLabel.setText("Pressure             : ");

        humidityLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        humidityLabel.setForeground(new java.awt.Color(255, 255, 255));
        humidityLabel.setText("Humidity           : ");

        cityNameLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        cityNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityNameLabel.setText("City Name         : ");

        coordLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        coordLabel.setForeground(new java.awt.Color(255, 255, 255));
        coordLabel.setText("Coordiantes     : ");

        tempLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        tempLabel1.setForeground(new java.awt.Color(255, 255, 255));
        tempLabel1.setText("Temperatrure : ");

        tempValue.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        tempValue.setForeground(new java.awt.Color(255, 255, 255));
        tempValue.setText(" 00.0 °C");

        descriptionValue.setFont(new java.awt.Font("Skia", 1, 16)); // NOI18N
        descriptionValue.setForeground(new java.awt.Color(255, 255, 255));
        descriptionValue.setText("NA");

        windSpeedValue.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        windSpeedValue.setForeground(new java.awt.Color(255, 255, 255));
        windSpeedValue.setText("00.0 m/s");

        pressureValue.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        pressureValue.setForeground(new java.awt.Color(255, 255, 255));
        pressureValue.setText("00.0 hPa");

        humidityValue.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        humidityValue.setForeground(new java.awt.Color(255, 255, 255));
        humidityValue.setText("00.0 %");

        cityValue.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        cityValue.setForeground(new java.awt.Color(255, 255, 255));
        cityValue.setText("NA");

        coordValue.setFont(new java.awt.Font("Skia", 1, 16)); // NOI18N
        coordValue.setForeground(new java.awt.Color(255, 255, 255));
        coordValue.setText("00.0 , 00.0 ");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(rightPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(descriptionLabel)
                                                        .addComponent(windLabel)
                                                        .addComponent(pressureLabel)
                                                        .addComponent(humidityLabel)
                                                        .addComponent(cityNameLabel)
                                                        .addComponent(coordLabel)
                                                        .addComponent(tempLabel1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(rightPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tempValue, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(descriptionValue,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(windSpeedValue,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pressureValue,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(humidityValue,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cityValue, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(coordValue, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(weatherDetailTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        434, Short.MAX_VALUE)))
                                .addContainerGap()));
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(weatherDetailTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tempLabel1)
                                                .addComponent(tempValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(descriptionLabel)
                                                .addComponent(descriptionValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(windLabel)
                                                .addComponent(windSpeedValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(pressureLabel)
                                                .addComponent(pressureValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(humidityLabel)
                                                .addComponent(humidityValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cityNameLabel)
                                                .addComponent(cityValue))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(coordLabel)
                                                .addComponent(coordValue))
                                .addGap(30, 30, 30)));

        leftPanel.setBackground(new java.awt.Color(209, 212, 201));

        climaTitle.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        climaTitle.setForeground(new java.awt.Color(41, 67, 92));
        climaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        climaTitle.setText("C L I M A - G U I");

        currentWeatherButton.setBackground(new java.awt.Color(255, 255, 255));
        currentWeatherButton.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        currentWeatherButton.setForeground(new java.awt.Color(41, 67, 92));
        currentWeatherButton.setText("Current Location Weather");
        currentWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentWeatherButtonActionPerformed(evt);
            }
        });

        cityTextField.setBackground(new java.awt.Color(255, 255, 255));
        cityTextField.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        cityTextField.setForeground(new java.awt.Color(41, 67, 92));
        cityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityTextField.setText("Enter City Name");
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        cityWeatherButton.setBackground(new java.awt.Color(255, 255, 255));
        cityWeatherButton.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        cityWeatherButton.setForeground(new java.awt.Color(41, 67, 92));
        cityWeatherButton.setText("Get Weather");
        cityWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityWeatherButtonActionPerformed(evt);
            }
        });

        climaTitle1.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        climaTitle1.setForeground(new java.awt.Color(41, 67, 92));
        climaTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        climaTitle1.setText(" J A V A  &  A P I");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(leftPanelLayout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(cityWeatherButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(currentWeatherButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 306,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(leftPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(climaTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                306, Short.MAX_VALUE)
                                                        .addComponent(climaTitle1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cityTextField))))
                                .addContainerGap(8, Short.MAX_VALUE)));
        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(climaTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(climaTitle1)
                                .addGap(80, 80, 80)
                                .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(cityWeatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63,
                                        Short.MAX_VALUE)
                                .addComponent(currentWeatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	cityWeatherButtonActionPerformed(evt);
    }

    private void currentWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try 
        {
            LocNetworkHelper t = new LocNetworkHelper();
            t.getIP_Addr();
            t.trackIP_Addr();
            t.getLocationWeatherData();
            ClimaData recievedData = new ClimaData();
            recievedData = t.decodeData();
            //debug : recievedData.display();
            
            if (recievedData != null)
            {
                    recievedData.temp-=273.15;
                    String tempString = recievedData.temp.toString();
                    tempString = tempString.substring(0, tempString.indexOf(".")+2);
                    tempValue.setText(tempString+ " °C");
                    descriptionValue.setText(recievedData.description.toUpperCase());
                    windSpeedValue.setText(recievedData.speed.toString() + " m/s");
                    pressureValue.setText(recievedData.pressure.toString() + " hPa");
                    humidityValue.setText(recievedData.humidity.toString() + " %");
                    cityValue.setText((recievedData.name).toUpperCase());
                    coordValue.setText(recievedData.lat.toString() + " lat , " + recievedData.lon.toString() + " lon");
                    cityTextField.setText((recievedData.name));
            }
            else
            {
                throw new Exception("Data Not Found");
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"UNABLE TO FETCH DATA !!!\nSome Pausible Causes : \n1) Network Issue\n2)Sever Not Available", "E R R O R - Data Fot Found ", JOptionPane.ERROR_MESSAGE);
            System.out.println("E R R O R : "+e.getMessage());
        }
    }

    private void cityWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String city = cityTextField.getText();

        ClimaData recievedData;
        try {
            recievedData = CityNetworkHelepr.decodeCityData(city);
            if (recievedData != null) {
                tempValue.setText((recievedData.temp).toString() + " °C");
                descriptionValue.setText(recievedData.description.toUpperCase());
                windSpeedValue.setText(recievedData.speed.toString() + " m/s");
                pressureValue.setText(recievedData.pressure.toString() + " hPa");
                humidityValue.setText(recievedData.humidity.toString() + " %");
                cityValue.setText((recievedData.name).toUpperCase());
                coordValue.setText(recievedData.lat.toString() + " lat , " + recievedData.lon.toString() + " lon");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClimaClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    public javax.swing.JLabel cityNameLabel;
    public javax.swing.JTextField cityTextField;
    public javax.swing.JLabel cityValue;
    public javax.swing.JButton cityWeatherButton;
    public javax.swing.JLabel climaTitle;
    public javax.swing.JLabel climaTitle1;
    public javax.swing.JLabel coordLabel;
    public javax.swing.JLabel coordValue;
    public javax.swing.JButton currentWeatherButton;
    public javax.swing.JLabel descriptionLabel;
    public javax.swing.JLabel descriptionValue;
    public javax.swing.JLabel humidityLabel;
    public javax.swing.JLabel humidityValue;
    public javax.swing.JPanel leftPanel;
    public javax.swing.JLabel pressureLabel;
    public javax.swing.JLabel pressureValue;
    private javax.swing.JPanel rightPanel;
    public javax.swing.JLabel tempLabel1;
    public javax.swing.JLabel tempValue;
    public javax.swing.JLabel weatherDetailTitle;
    public javax.swing.JLabel windLabel;
    public javax.swing.JLabel windSpeedValue;
    // End of variables declaration
}