package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoDeclaracaoExportacao extends AbstractSankhyaEntity<InformacaoDeclaracaoExportacao> {
   public BigDecimal getCodPaisDestino() {
        return this.getVo().asBigDecimal("CODPAISDESTINO");
   }

   public void setCodPaisDestino(BigDecimal codPaisDestino) {
        markAsChanged("CODPAISDESTINO", codPaisDestino);
   }

   public Timestamp getDtaVerbacao() {
        return this.getVo().asTimestamp("DTAVERBACAO");
   }

   public void setDtaVerbacao(Timestamp dtaVerbacao) {
        markAsChanged("DTAVERBACAO", dtaVerbacao);
   }

   public Timestamp getDtDeclaracao() {
        return this.getVo().asTimestamp("DTDECLARACAO");
   }

   public void setDtDeclaracao(Timestamp dtDeclaracao) {
        markAsChanged("DTDECLARACAO", dtDeclaracao);
   }

   public String getNatureza() {
        return this.getVo().asString("NATUREZA");
   }

   public void setNatureza(String natureza) {
        markAsChanged("NATUREZA", natureza);
   }

   public String getNroDeclaracao() {
        return this.getVo().asString("NRODECLARACAO");
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        markAsChanged("NRODECLARACAO", nroDeclaracao);
   }

   public BigDecimal getTipoDec() {
        return this.getVo().asBigDecimal("TIPODEC");
   }

   public void setTipoDec(BigDecimal tipoDec) {
        markAsChanged("TIPODEC", tipoDec);
   }

   @Override
   public String getTableName() {
        return "TGFEXPD";
   }

   @Override
   public String getEntityName() {
        return "InformacaoDeclaracaoExportacao";
   }

   @Override
   public InformacaoDeclaracaoExportacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
