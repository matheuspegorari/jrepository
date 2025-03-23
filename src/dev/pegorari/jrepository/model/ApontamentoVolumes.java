package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoVolumes extends AbstractSankhyaEntity<ApontamentoVolumes> {
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
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getId() {
        return id;
   }

   public void setId(BigDecimal id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
        this.idIatv = idIatv;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
        this.nroLote = nroLote;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
        this.pesoLiq = pesoLiq;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TPRAVO";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoVolumes";
   }

   @Override
   public ApontamentoVolumes fromVO(DynamicVO vo) {
        this.setVo(vo);
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
