package com.bikesglobalstore.bikes.attributes.converters;

import com.bikesglobalstore.bikes.enumerations.BikeModel;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

//This converter will convert BikeModel enumeration values to string
//these BikeModel values will be stored in the database as string values
//and will be fetched from the dataBase as BikeModel instances;
@Converter(autoApply = true) //autoplay = true; to make this enum converter available for all objects of type BikeModel
public class BikeModelAttributeConverter implements AttributeConverter<BikeModel, String> {
    @Override
    public String convertToDatabaseColumn(BikeModel bikeModel) {
        if (bikeModel == null) {
            return null;
        }
        return switch (bikeModel) {
            case BM903 -> "BM903";
            case Killer99 -> "Killer99";
            case Race_JTK -> "Race_JTK";
            case Regular20 -> "Regular20";
        };
    }

    @Override
    public BikeModel convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }
        return switch (s) {
            case "BM903" -> BikeModel.BM903;
            case "Killer99" -> BikeModel.Killer99;
            case "Race_JTK" -> BikeModel.Race_JTK;
            case "Regular20" -> BikeModel.Regular20;
            default -> null;

        };
    }
}
