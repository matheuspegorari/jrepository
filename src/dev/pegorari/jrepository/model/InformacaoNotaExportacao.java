package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoNotaExportacao extends AbstractSankhyaEntity<InformacaoNotaExportacao> {
   public Timestamp getDtConhec() {
        return this.getVo().asTimestamp("DTCONHEC");
   }

   public void setDtConhec(Timestamp dtConhec) {
        markAsChanged("DTCONHEC", dtConhec);
   }

   public String getNroConhec() {
        return this.getVo().asString("NROCONHEC");
   }

   public void setNroConhec(String nroConhec) {
        markAsChanged("NROCONHEC", nroConhec);
   }

   public String getNroDeclaracao() {
        return this.getVo().asString("NRODECLARACAO");
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        markAsChanged("NRODECLARACAO", nroDeclaracao);
   }

   public String getNroRe() {
        return this.getVo().asString("NRORE");
   }

   public void setNroRe(String nroRe) {
        markAsChanged("NRORE", nroRe);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getTipoConhec() {
        return this.getVo().asBigDecimal("TIPOCONHEC");
   }

   public void setTipoConhec(BigDecimal tipoConhec) {
        markAsChanged("TIPOCONHEC", tipoConhec);
   }

   @Override
   public String getTableName() {
        return "TGFEXPN";
   }

   @Override
   public String getEntityName() {
        return "InformacaoNotaExportacao";
   }

   @Override
   public InformacaoNotaExportacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
