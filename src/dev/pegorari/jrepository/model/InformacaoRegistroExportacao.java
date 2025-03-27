package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class InformacaoRegistroExportacao extends AbstractSankhyaEntity<InformacaoRegistroExportacao> {
   public Timestamp getDtRe() {
        return this.getVo().asTimestamp("DTRE");
   }

   public void setDtRe(Timestamp dtRe) {
        markAsChanged("DTRE", dtRe);
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

   @Override
   public String getTableName() {
        return "TGFEXPR";
   }

   @Override
   public String getEntityName() {
        return "InformacaoRegistroExportacao";
   }

   @Override
   public InformacaoRegistroExportacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
