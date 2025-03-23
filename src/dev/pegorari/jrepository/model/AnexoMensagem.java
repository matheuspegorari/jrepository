package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoMensagem extends AbstractSankhyaEntity<AnexoMensagem> {
   private byte[] anexo;
   private String cid;
   private String nomeArquivo;
   private BigDecimal nuAnexo;
   private String tipo;

   public byte[] getAnexo() {
        return anexo;
   }

   public void setAnexo(byte[] anexo) {
        markAsChanged("ANEXO", anexo);
        this.anexo = anexo;
   }

   public String getCid() {
        return cid;
   }

   public void setCid(String cid) {
        markAsChanged("CID", cid);
        this.cid = cid;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public BigDecimal getNuAnexo() {
        return nuAnexo;
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        markAsChanged("NUANEXO", nuAnexo);
        this.nuAnexo = nuAnexo;
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
        return "TMDAMG";
   }

   @Override
   public String getEntityName() {
        return "AnexoMensagem";
   }

   @Override
   public AnexoMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.anexo = vo.asBlob("ANEXO");
        this.cid = vo.asString("CID");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.nuAnexo = vo.asBigDecimal("NUANEXO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
