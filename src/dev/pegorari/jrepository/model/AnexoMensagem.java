package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoMensagem extends AbstractSankhyaEntity<AnexoMensagem> {
   public byte[] getAnexo() {
        return this.getVo().asBlob("ANEXO");
   }

   public void setAnexo(byte[] anexo) {
        markAsChanged("ANEXO", anexo);
   }

   public String getCid() {
        return this.getVo().asString("CID");
   }

   public void setCid(String cid) {
        markAsChanged("CID", cid);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public BigDecimal getNuAnexo() {
        return this.getVo().asBigDecimal("NUANEXO");
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        markAsChanged("NUANEXO", nuAnexo);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TMDAMG";
   }

   @Override
   public String getEntityName() {
        return "AnexoMensagem";
   }

   @Override
   public AnexoMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
