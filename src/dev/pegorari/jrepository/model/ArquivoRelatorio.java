package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ArquivoRelatorio extends AbstractSankhyaEntity<ArquivoRelatorio> {
   public char[] getArquivo() {
        return this.getVo().asClob("ARQUIVO");
   }

   public void setArquivo(char[] arquivo) {
        markAsChanged("ARQUIVO", arquivo);
   }

   public byte[] getArquivoBin() {
        return this.getVo().asBlob("ARQUIVOBIN");
   }

   public void setArquivoBin(byte[] arquivoBin) {
        markAsChanged("ARQUIVOBIN", arquivoBin);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSIRFA";
   }

   @Override
   public String getEntityName() {
        return "ArquivoRelatorio";
   }

   @Override
   public ArquivoRelatorio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
