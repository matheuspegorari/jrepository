package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;

public class InformacaoRegistroExportacao implements SankhyaEntity<InformacaoRegistroExportacao> {

   private Timestamp dtRe;
   private String nroDeclaracao;
   private String nroRe;

   public Timestamp getDtRe() {
        return dtRe;
   }

   public void setDtRe(Timestamp dtRe) {
        this.dtRe = dtRe;
   }

   public String getNroDeclaracao() {
        return nroDeclaracao;
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        this.nroDeclaracao = nroDeclaracao;
   }

   public String getNroRe() {
        return nroRe;
   }

   public void setNroRe(String nroRe) {
        this.nroRe = nroRe;
   }

   @Override
   public String getEntityName() {
        return "InformacaoRegistroExportacao";
   }

   @Override
   public InformacaoRegistroExportacao fromVO(DynamicVO vo) {
        this.dtRe = vo.asTimestamp("DTRE");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.nroRe = vo.asString("NRORE");
        return this;
   }
}
