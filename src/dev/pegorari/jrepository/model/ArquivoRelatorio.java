package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ArquivoRelatorio extends AbstractSankhyaEntity<ArquivoRelatorio> {
   private char[] arquivo;
   private byte[] arquivoBin;
   private String nome;
   private BigDecimal nuRfe;
   private BigDecimal sequencia;

   public char[] getArquivo() {
        return arquivo;
   }

   public void setArquivo(char[] arquivo) {
        this.arquivo = arquivo;
   }

   public byte[] getArquivoBin() {
        return arquivoBin;
   }

   public void setArquivoBin(byte[] arquivoBin) {
        this.arquivoBin = arquivoBin;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
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
        this.arquivo = vo.asClob("ARQUIVO");
        this.arquivoBin = vo.asBlob("ARQUIVOBIN");
        this.nome = vo.asString("NOME");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
