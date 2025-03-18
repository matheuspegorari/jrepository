package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ColetaEntregaPorNota extends AbstractSankhyaEntity<ColetaEntregaPorNota> {
   private String cgcCpf;
   private BigDecimal codMunFis;
   private BigDecimal codParc;
   private String inscEstad;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private String tipo;
   private BigDecimal tipoTransp;

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
        this.codMunFis = codMunFis;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public String getInscEstad() {
        return inscEstad;
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
        this.inscEstad = inscEstad;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getTipoTransp() {
        return tipoTransp;
   }

   public void setTipoTransp(BigDecimal tipoTransp) {
        markAsChanged("TIPOTRANSP", tipoTransp);
        this.tipoTransp = tipoTransp;
   }

   @Override
   public String getTableName() {
        return "TGFNCE";
   }

   @Override
   public String getEntityName() {
        return "ColetaEntregaPorNota";
   }

   @Override
   public ColetaEntregaPorNota fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.cgcCpf = vo.asString("CGC_CPF");
        this.codMunFis = vo.asBigDecimal("CODMUNFIS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.inscEstad = vo.asString("INSCESTAD");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asString("TIPO");
        this.tipoTransp = vo.asBigDecimal("TIPOTRANSP");
        return this;
   }
}
