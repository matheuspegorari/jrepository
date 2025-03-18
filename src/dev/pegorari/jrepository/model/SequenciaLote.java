package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SequenciaLote extends AbstractSankhyaEntity<SequenciaLote> {
   private BigDecimal seqConf;
   private BigDecimal nuConf;
   private String identificador;
   private String codBarra;

   public BigDecimal getSeqConf() {
        return seqConf;
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
        this.seqConf = seqConf;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
        this.identificador = identificador;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   @Override
   public String getTableName() {
        return "TGFSLT";
   }

   @Override
   public String getEntityName() {
        return "SequenciaLote";
   }

   @Override
   public SequenciaLote fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.seqConf = vo.asBigDecimal("SEQCONF");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.identificador = vo.asString("IDENTIFICADOR");
        this.codBarra = vo.asString("CODBARRA");
        return this;
   }
}
