//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 12:17:31 PM CST 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CargoTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CommodityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NatureCodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Commodity Classification. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about Commodity Classification.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Commodity Classification&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CommodityClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CommodityCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", propOrder = {
    "natureCode",
    "cargoTypeCode",
    "commodityCode",
    "itemClassificationCode"
})
public class CommodityClassificationType {

    @XmlElement(name = "NatureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NatureCodeType natureCode;
    @XmlElement(name = "CargoTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CargoTypeCodeType cargoTypeCode;
    @XmlElement(name = "CommodityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CommodityCodeType commodityCode;
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ItemClassificationCodeType itemClassificationCode;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Commodity Classification. Nature Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The high-level nature of the Classification issued by a specific maintenance agency, expressed as a code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Commodity Classification&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Nature Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"wooden products"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link NatureCodeType }
     *     
     */
    public NatureCodeType getNatureCode() {
        return natureCode;
    }

    /**
     * Sets the value of the natureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureCodeType }
     *     
     */
    public void setNatureCode(NatureCodeType value) {
        this.natureCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Commodity Classification. Cargo Type Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The type of cargo, expressed as a code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Commodity Classification&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Cargo Type Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"Refrigerated"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public CargoTypeCodeType getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Sets the value of the cargoTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public void setCargoTypeCode(CargoTypeCodeType value) {
        this.cargoTypeCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Commodity Classification. Commodity Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The harmonized international commodity code for regulatory (customs and trade statistics) purposes.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Commodity Classification&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Commodity Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Harmonized Code&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"1102222883"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CommodityCodeType }
     *     
     */
    public CommodityCodeType getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCodeType }
     *     
     */
    public void setCommodityCode(CommodityCodeType value) {
        this.commodityCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Commodity Classification. Item Classification Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The trade commodity classification, expressed as a code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Commodity Classification&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Item Classification Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;UN/SPSC Code&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"3440234"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public ItemClassificationCodeType getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Sets the value of the itemClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCodeType value) {
        this.itemClassificationCode = value;
    }

}
