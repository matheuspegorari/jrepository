package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoVolumes implements SankhyaEntity<ApontamentoVolumes> {

   private BigDecimal codProd;
   private String controle;
   private BigDecimal id;
   private BigDecimal idIatv;
   private BigDecimal idIproc;
   private String nroLote;
   private BigDecimal nuApo;
   private BigDecimal pesoBruto;
   private BigDecimal pesoLiq;
   private String tipo;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getId() {
        return id;
   }

   public void setId(BigDecimal id) {
        this.id = id;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        this.idIatv = idIatv;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ApontamentoVolumes";
   }

   @Override
   public ApontamentoVolumes fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.id = vo.asBigDecimal("ID");
        this.idIatv = vo.asBigDecimal("IDIATV");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.nroLote = vo.asString("NROLOTE");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoLiq = vo.asBigDecimal("PESOLIQ");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
