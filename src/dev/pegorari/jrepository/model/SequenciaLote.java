package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class SequenciaLote implements SankhyaEntity<SequenciaLote> {

   private BigDecimal seqConf;
   private BigDecimal nuConf;
   private String identificador;
   private String codBarra;

   public BigDecimal getSeqConf() {
        return seqConf;
   }

   public void setSeqConf(BigDecimal seqConf) {
        this.seqConf = seqConf;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        this.nuConf = nuConf;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        this.identificador = identificador;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   @Override
   public String getEntityName() {
        return "SequenciaLote";
   }

   @Override
   public SequenciaLote fromVO(DynamicVO vo) {
        this.seqConf = vo.asBigDecimal("SEQCONF");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.identificador = vo.asString("IDENTIFICADOR");
        this.codBarra = vo.asString("CODBARRA");
        return this;
   }
}
